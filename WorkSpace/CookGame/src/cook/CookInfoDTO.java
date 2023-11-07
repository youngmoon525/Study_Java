package cook;

import java.util.ArrayList;

public class CookInfoDTO {
	private int cook_no , cnt , level_cnt , score;
	private String cook_name, create_date, create_by;
	
	
	
	
	public CookInfoDTO(int cook_no, int level_cnt, String cook_name) {

		this.cook_no = cook_no;
		this.level_cnt = level_cnt;
		this.cook_name = cook_name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getLevel_cnt() {
		return level_cnt;
	}
	public void setLevel_cnt(int level_cnt) {
		this.level_cnt = level_cnt;
	}

	public int getCook_no() {
		return cook_no;
	}
	public void setCook_no(int cook_no) {
		this.cook_no = cook_no;
	}
	public String getCook_name() {
		return cook_name;
	}
	public void setCook_name(String cook_name) {
		this.cook_name = cook_name;
	}
	
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
