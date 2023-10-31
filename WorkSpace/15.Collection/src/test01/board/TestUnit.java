package test01.board;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestUnit {

	@DisplayName("select")
	@Test
	void select() {
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = new ArrayList<>();
		dao.select(list);
	}

}
