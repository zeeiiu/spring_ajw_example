package edu.global.ex.board.one;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*
1.interface IBDao��  XML namespac�� ���� <mapper namespace=".IBDao"> 
2.sqlSession.getMapper(IBDao.class)�� �̿�.
* 
* 
* */
@Controller
public class BController1 {

	@Inject
	BService1 bservice;
	
	@RequestMapping("/list1")
	public String list(Model model) throws Exception{
		System.out.println("list1()");	
		
		model.addAttribute("boards", bservice.selectBoardList());			
		return "list";		
	}

}
