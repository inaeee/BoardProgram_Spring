package com.example.board;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value= {"com.example.board.boardsub.mapper"})
//@MapperScan: Mapper인터페이스를 인식할 수 있도록 설정
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}
	
	/*
	 * SqlSessionFactory 설정
	 */
	
	@Bean //스트링에 필요한 객체를 생성
	//MyBatis의 SqlSeesionFactory를 반환해줌, 스트링부트가 실행할 때 DataSource객체를 이 메서드 실행 시 주입해서 결과를 만들고, 그 결과를 스트링 내 빈으로 사용하게 된다.
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource);
		return sessionFactory.getObject();
	}

}
