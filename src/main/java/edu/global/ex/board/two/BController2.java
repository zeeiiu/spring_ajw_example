package edu.global.ex.board.two;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/*
1. interface는 필요가 없음 
2. sqlSession에서 제공하는 함수(selectList,selectOne)를 이용함
3. 쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는  개발자가가 정함
* 
* */

@Controller
public class BController2 {

   @Inject
   BService2 bservice;
   
   @RequestMapping("/list2")
   public String list(Model model) throws Exception{
      System.out.println("list2()");   
      
      model.addAttribute("boards", bservice.selectBoardList());         
      return "list";      
   }
}