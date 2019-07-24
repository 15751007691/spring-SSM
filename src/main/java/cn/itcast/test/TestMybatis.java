package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws Exception {

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.fiandAll();
        for (Account account:list){
            System.out.println(account);
        }
        session.close();
        inputStream.close();
    }

    @Test
    public void run2() throws Exception {
        Account account=new Account();
        account.setName("熊大");
        account.setMoney(4000d);
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        //保存
        dao.saveAccount(account);
        session.commit();
        //释放
        session.close();
        inputStream.close();
    }
}
