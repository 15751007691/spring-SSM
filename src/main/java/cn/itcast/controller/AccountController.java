package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
* web层控制器
* */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findall")
    public String fiandAll(Model model){
        System.out.println("表现层：查询所有的账户信息");
        //调用service方法
        List<Account> list = accountService.fiandAll();
        model.addAttribute("list",list);
        return "List";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层：查询所有的账户信息");
        //调用service方法
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findall");
        return;
    }
}
