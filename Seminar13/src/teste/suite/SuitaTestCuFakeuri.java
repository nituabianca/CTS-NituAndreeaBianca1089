package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.categorii.CategorieUtilizareBoundary;
import teste.categorii.CategorieUtilizareFake;
import teste.testare.TestAgentieDubluri;
import teste.testare.TestPachetTuristic;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieUtilizareBoundary.class)
public class SuitaTestCuFakeuri {

}
