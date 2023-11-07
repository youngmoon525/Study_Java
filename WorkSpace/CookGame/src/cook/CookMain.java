package cook;

import java.util.ArrayList;
import java.util.Random;

public class CookMain {
	public static void main(String[] args) {
		CookDAO dao = new CookDAO();
		int level_cnt = 2; //<=사용자에게 입력받게 수정해야함 나중에.
		
		ArrayList<CookInfoDTO> list = dao.getCookList(level_cnt);
		dao.displayCookList(list);
		
		
		//랜덤한 난이도로 하나 빼옴
		CookInfoDTO randomDto = list.get(new Random().nextInt(list.size()));
		ArrayList<RecipeInfoDTO> recipeList = dao.getRecipeList(randomDto);
		
		dao.displayRecipeList(recipeList);
		
	}
}
