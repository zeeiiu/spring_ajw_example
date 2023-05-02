package edu.global.ex.board.one;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import edu.global.ex.vo.BoardVO;


/*
1.interface IBDao를  XML namespac에 매핑 <mapper namespace=".IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */
@Service 
public class BService1 {
   
	@Inject /* @Autowired로 써도 됨 */
   private SqlSession sqlSession; // 마이바티스. root-context.xml에 있음
   
    public List<BoardVO> selectBoardList() throws Exception {
       
       IBDao dao = sqlSession.getMapper(IBDao.class); // IBDao.class는 원형. 붕어빵 틀이라고 생각하기. 
      
       return dao.listDao();
    }

}
