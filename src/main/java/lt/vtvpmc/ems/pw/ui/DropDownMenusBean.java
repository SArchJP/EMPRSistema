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
    List<Integer> yearList;

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

        yearList = new ArrayList<Integer>();
        yearList.add(2017);
        yearList.add(2016);
        yearList.add(2015);
        yearList.add(2014);
        yearList.add(2013);
        yearList.add(2012);
        yearList.add(2011);
        yearList.add(2010);
        yearList.add(2009);
        yearList.add(2008);
        yearList.add(2007);
        yearList.add(2006);
        yearList.add(2005);
        yearList.add(2004);
        yearList.add(2003);
        yearList.add(2002);
        yearList.add(2001);
        yearList.add(2000);
        yearList.add(1999);
        yearList.add(1998);
        yearList.add(1997);
        yearList.add(1996);
        yearList.add(1995);
        yearList.add(1994);
        yearList.add(1993);
        yearList.add(1992);
        yearList.add(1991);
        yearList.add(1990);
        yearList.add(1989);
        yearList.add(1988);
        yearList.add(1987);
        yearList.add(1986);
        yearList.add(1985);
        yearList.add(1984);
        yearList.add(1983);
        yearList.add(1982);
        yearList.add(1981);
        yearList.add(1980);
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

    public List<Integer> getYearList() {
        return yearList;
    }
}
