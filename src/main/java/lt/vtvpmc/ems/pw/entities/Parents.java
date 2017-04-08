package lt.vtvpmc.ems.pw.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Parents implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // Dad
    private String dadsName;
    private String dadsSecondName;
    private String dadsAddress;
    private long dadsPhone;
    // Mom
    private String momsName;
    private String momsSecondName;
    private String momsAddress;
    private long momsPhone;
    // Guardian
    private String guardiansName;
    private String guardiansSecondName;
    private String guardiansAddress;
    private long guardiansPhone;

    // No arg constructor
    public Parents() {
    }

    // Arg true constructor
    public Parents(String dadsName, String dadsSecondName, String dadsAddress, long dadsPhone, String momsName, String momsSecondName, String momsAddress, long momsPhone, String guardiansName, String guardiansSecondName, String guardiansAdress, long guardiansPhone) {
        this.dadsName = dadsName;
        this.dadsSecondName = dadsSecondName;
        this.dadsAddress = dadsAddress;
        this.dadsPhone = dadsPhone;
        this.momsName = momsName;
        this.momsSecondName = momsSecondName;
        this.momsAddress = momsAddress;
        this.momsPhone = momsPhone;
        this.guardiansName = guardiansName;
        this.guardiansSecondName = guardiansSecondName;
        this.guardiansAddress = guardiansAdress;
        this.guardiansPhone = guardiansPhone;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDadsName() {
        return dadsName;
    }

    public void setDadsName(String dadsName) {
        this.dadsName = dadsName;
    }

    public String getDadsSecondName() {
        return dadsSecondName;
    }

    public void setDadsSecondName(String dadsSecondName) {
        this.dadsSecondName = dadsSecondName;
    }

    public String getDadsAddress() {
        return dadsAddress;
    }

    public void setDadsAddress(String dadsAdress) {
        this.dadsAddress = dadsAdress;
    }

    public long getDadsPhone() {
        return dadsPhone;
    }

    public void setDadsPhone(long dadsPhone) {
        this.dadsPhone = dadsPhone;
    }

    public String getMomsName() {
        return momsName;
    }

    public void setMomsName(String momsName) {
        this.momsName = momsName;
    }

    public String getMomsSecondName() {
        return momsSecondName;
    }

    public void setMomsSecondName(String momsSecondName) {
        this.momsSecondName = momsSecondName;
    }

    public String getMomsAddress() {
        return momsAddress;
    }

    public void setMomsAddress(String momsAdress) {
        this.momsAddress = momsAdress;
    }

    public long getMomsPhone() {
        return momsPhone;
    }

    public void setMomsPhone(long momsPhone) {
        this.momsPhone = momsPhone;
    }

    public String getGuardiansName() {
        return guardiansName;
    }

    public void setGuardiansName(String guardiansName) {
        this.guardiansName = guardiansName;
    }

    public String getGuardiansSecondName() {
        return guardiansSecondName;
    }

    public void setGuardiansSecondName(String guardiansSecondName) {
        this.guardiansSecondName = guardiansSecondName;
    }

    public String getGuardiansAddress() {
        return guardiansAddress;
    }

    public void setGuardiansAddress(String guardiansAdress) {
        this.guardiansAddress = guardiansAdress;
    }

    public long getGuardiansPhone() {
        return guardiansPhone;
    }

    public void setGuardiansPhone(long guardiansPhone) {
        this.guardiansPhone = guardiansPhone;
    }
}
