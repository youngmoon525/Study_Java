package test01.board;

import java.util.ArrayList;

public class BoardMain {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = new ArrayList<>();
		list.add(new BoardDTO(1, "제목", "내용", "작성자"));
		list.add(new BoardDTO(2, "제목2", "내용2", "작성자2"));
		BoardDTO dto = dao.insert();
		list.add(dto);
		//dao.delete(list);
		dao.select(list);
		dao.selectWhere(list);
	}
}
