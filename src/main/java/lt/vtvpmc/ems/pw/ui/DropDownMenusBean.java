package lt.vtvpmc.ems.pw.ui;


import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@PersistenceContext
public class DropDownMenusBean {

    // Drop down lists for municipal, education, maritalStatus
    List<String> municipalOption;
    List<String> educationOptions;
    List<String> martialStatusOption;
    List<String> requestTierOptions;

    // No-arg constructor

    public DropDownMenusBean() {
        municipalOption = new ArrayList<String>();
        municipalOption.add("Alytaus m.");
        municipalOption.add("Alytaus raj.");
        municipalOption.add("Kauno m.");
        municipalOption.add("Kauno raj.");
        municipalOption.add("Klaipėdos m.");
        municipalOption.add("Klaipėdos raj.");
        municipalOption.add("Marijampolės m.");
        municipalOption.add("Panevėžio m.");
        municipalOption.add("Panevėžio raj.");
        municipalOption.add("Utenos raj.");
        municipalOption.add("Visagino m.");
        municipalOption.add("Vilniaus m.");
        municipalOption.add("Vilniaus raj.");

        educationOptions = new ArrayList<String>();
        educationOptions.add("Aukštasis išsilavinimas");
        educationOptions.add("Aukštesnysis išsilavinimas");
        educationOptions.add("Specialusis vidurinis išsilavinimas");
        educationOptions.add("Vidurinis išsilavinimas ");
        educationOptions.add("Pagrindinis išsilavinimas");
        educationOptions.add("Pradinis išsilavinimas");
        educationOptions.add("Nereglamentuojamas");
        educationOptions.add("Aukštasis universitetinis išsilavinimas");
        educationOptions.add("Aukštasis koleginis išsilavinimas");

        martialStatusOption = new ArrayList<String>();
        martialStatusOption.add("vedęs/ištekėjusi");
        martialStatusOption.add("nevedęs/neištekėjusi");
        martialStatusOption.add("našlaitis(-ė)");

        requestTierOptions = new ArrayList<>();
        requestTierOptions.add("III pakopa");
        requestTierOptions.add("IV pakopa");
    }

    //    Get Lists
    public List<String> getMunicipalOption() {
        return municipalOption;
    }

    public List<String> getEducationOptions() {
        return educationOptions;
    }

    public List<String> getMartialStatusOption() {
        return martialStatusOption;
    }

    public List<String> getRequestTierOptions() {
        return requestTierOptions;
    }
}
