
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

import static org.junit.Assert.assertEquals;

    public class DatabaseTest {

        private Database database;

        @Before
        public void setUp() {
            database = new Database();
        }

        @Test
        public void testAvailableBuns() {
            List<Bun> buns = database.availableBuns();

            // Проверка количества булочек
            assertEquals(3, buns.size());

            // Проверка конкретных булочек по имени и цене
            assertEquals("black bun", buns.get(0).getName());
            assertEquals(100, buns.get(0).getPrice(), 0.01);
            assertEquals("white bun", buns.get(1).getName());
            assertEquals(200, buns.get(1).getPrice(), 0.01);
            assertEquals("red bun", buns.get(2).getName());
            assertEquals(300, buns.get(2).getPrice(), 0.01);
        }

        @Test
        public void testAvailableIngredients() {
            List<Ingredient> ingredients = database.availableIngredients();

            // Проверка количества ингредиентов
            assertEquals(6, ingredients.size());

            // Проверка конкретных ингредиентов по типу, названию и цене
            assertEquals(IngredientType.SAUCE, ingredients.get(0).getType());
            assertEquals("hot sauce", ingredients.get(0).getName());
            assertEquals(100, ingredients.get(0).getPrice(), 0.01);

        }
    }
