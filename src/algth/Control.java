package algth;

import data.EAC;
import view.Menu;
import java.util.ArrayList;

public class Control extends Menu<String> {

    static String[] menu = {"Add Country Information", "Get Recently Entered Information", "SSearch by Country Name", "Sort Information by Ascending Order"};


    private final AlgthIn algthIn = new AlgthIn();
    public ArrayList<EAC> lc = new ArrayList<>();
//------------------------------------------------------------------------------------------------------------------

    public Control() {
        super("!!!Management System!!!", menu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> InputCountryData();
            case 2 -> DisplayDataPutIn();
            case 3 -> SearchCountryDatabyName();
            case 4 -> DisplaySortbyName();
        }
    }

    private void InputCountryData() {
        algthIn.inputCountry(lc);
    }

    private void DisplayDataPutIn() {
        algthIn.printCountry(lc);
    }

    private void SearchCountryDatabyName() {
        algthIn.searchByName(lc);
    }

    private void DisplaySortbyName() {
        algthIn.printCountrySorted(lc);
    }
}