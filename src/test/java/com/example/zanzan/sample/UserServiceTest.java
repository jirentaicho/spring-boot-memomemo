package com.example.zanzan.sample;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DatabaseSetup("/data.xml")
@SpringBootTest
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class
})
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StockRepository stockRepository;

    @Test
    public void test_hoge(){
        String username = this.userRepository.get();
        assertEquals("admin",username);
    }

    /*
    @Test
    public void test_repo(){
        Stock stock = this.stockRepository.findById(1);
        assertEquals("鉛筆", stock.name);
    }
     */

    @Test
    public void test_repo_e(){
        Stock stock = this.stockRepository.findByName("鉛筆");
        assertEquals("鉛筆", stock.name);
    }

}
