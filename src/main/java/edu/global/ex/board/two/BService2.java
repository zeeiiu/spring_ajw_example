package edu.global.ex.board.two;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import edu.global.ex.vo.BoardVO;


/*
1. interface�� �ʿ䰡 ���� 
2. sqlSession���� �����ϴ� �Լ�(selectList,selectOne)�� �̿���
3. ���������� ���� XML�� �ʿ�. �ش� XML�� namespace��  �����ڰ��� ����
* 
* */
@Service
public class BService2 {
   
   @Inject
   SqlSession sqlSession;
   
    public List<BoardVO> selectBoardList() throws Exception {
      return sqlSession.selectList("board.selectBoardList");
    }
}


