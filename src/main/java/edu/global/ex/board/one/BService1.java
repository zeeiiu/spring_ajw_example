package edu.global.ex.board.one;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import edu.global.ex.vo.BoardVO;


/*
1.interface IBDao��  XML namespac�� ���� <mapper namespace=".IBDao"> 
2.sqlSession.getMapper(IBDao.class)�� �̿�.
* 
* 
* */
@Service 
public class BService1 {
   
	@Inject /* @Autowired�� �ᵵ �� */
   private SqlSession sqlSession; // ���̹�Ƽ��. root-context.xml�� ����
   
    public List<BoardVO> selectBoardList() throws Exception {
       
       IBDao dao = sqlSession.getMapper(IBDao.class); // IBDao.class�� ����. �ؾ Ʋ�̶�� �����ϱ�. 
      
       return dao.listDao();
    }

}
