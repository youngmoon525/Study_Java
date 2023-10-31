package test01.board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardDAO {
	// 쓰기 , 삭제 , 검색 , :전체 목록

	
	public void select(ArrayList<BoardDTO> list) {
		
		
		
		if (list.isEmpty()) {
			System.out.println("게시글 없음");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getBoardNo() + " ");
			System.out.print(list.get(i).getTitle() + " ");
			System.out.print(list.get(i).getContent() + " ");
			System.out.println(list.get(i).getWriter() + " ");
		}
	}

	public BoardDTO insert() {
		// dto를 만들때 사용된 내용. -> 스캐너
		BoardDTO dto = new BoardDTO(3, "메소드 제목", "메소드 내용", "메소드 작성자");
		return dto;
	}

	public void delete(ArrayList<BoardDTO> list) {
		list.remove(0);// <= 스캐너
	}

	public void selectWhere(ArrayList<BoardDTO> list) {
		// 임시 list를 만들어서 select<-메소드 실행
		// list를 입력받아 for문에서 eq
		String findParam = "제목";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(findParam)) {
				System.out.print(list.get(i).getBoardNo() + " ");
				System.out.print(list.get(i).getTitle() + " ");
				System.out.print(list.get(i).getContent() + " ");
				System.out.println(list.get(i).getWriter() + " ");
			}
		}
	}

}
