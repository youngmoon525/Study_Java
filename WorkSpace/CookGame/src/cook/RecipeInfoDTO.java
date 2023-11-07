package cook;

public class RecipeInfoDTO {
	private int recipe_no , cook_no;
	private String ingredient;
	public RecipeInfoDTO(int recipe_no, int cook_no, String ingredient) {
	
		this.recipe_no = recipe_no;
		this.cook_no = cook_no;
		this.ingredient = ingredient;
	}
	public int getRecipe_no() {
		return recipe_no;
	}
	public void setRecipe_no(int recipe_no) {
		this.recipe_no = recipe_no;
	}
	public int getCook_no() {
		return cook_no;
	}
	public void setCook_no(int cook_no) {
		this.cook_no = cook_no;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
	
}
