package com.company;

import java.io.Serializable;

public class Element implements Serializable {
    private String AtomicNumber = "AtomicNumber";
    private String Element = "Element";
    private String Symbol = "Symbol";
    private String AtomicMass = "AtomicMass";
    private String NumberofNeutrons = "NumberofNeutrons";
    private String NumberofProtons = "NumberofProtons";
    private String NumberofElectrons = "NumberofElectrons";
    private String Period = "Period";
    private String Group = "Group";
    private String Phase = "Phase";
    private String Radioactive = "Radioactive";
    private String Natural = "Natural";
    private String Metal = "Metal";
    private String Nonmetal = "Nonmetal";
    private String Metalloid = "Metalloid";
    private String Type = "Type";
    private String AtomicRadius = "AtomicRadius";
    private String Electronegativity = "Electronegativity";
    private String FirstIonization = "FirstIonization";
    private String Density = "Density";
    private String MeltingPoint = "MeltingPoint";
    private String BoilingPoint = "BoilingPoint";
    private String NumberOfIsotopes = "NumberOfIsotopes";
    private String Discoverer = "Discoverer";
    private String Year = "Year";
    private String SpecificHeat = "SpecificHeat";
    private String NumberofShells = "NumberofShells";
    private String NumberofValence = "NumberofValence";
    private String ChargeInCompound = "ChargeInCompound";

    public String getChargeInCompound() {
        return ChargeInCompound;
    }

    public void setChargeInCompound(String chargeInCompound) {
        ChargeInCompound = chargeInCompound;
    }

    public String getAtomicNumber() {
        return this.AtomicNumber;
    }

    public void setAtomicNumber(String AtomicNumber) {
        this.AtomicNumber = AtomicNumber;
    }

    public String getElement() {
        return this.Element;
    }

    public void setElement(String Element) {
        this.Element = Element;
    }

    public String getSymbol() {
        return this.Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getAtomicMass() {
        return this.AtomicMass;
    }

    public void setAtomicMass(String AtomicMass) {
        this.AtomicMass = AtomicMass;
    }

    public String getNumberofNeutrons() {
        return this.NumberofNeutrons;
    }

    public void setNumberofNeutrons(String NumberofNeutrons) {
        this.NumberofNeutrons = NumberofNeutrons;
    }

    public String getNumberofProtons() {
        return this.NumberofProtons;
    }

    public void setNumberofProtons(String NumberofProtons) {
        this.NumberofProtons = NumberofProtons;
    }

    public String getNumberofElectrons() {
        return this.NumberofElectrons;
    }

    public void setNumberofElectrons(String NumberofElectrons) {
        this.NumberofElectrons = NumberofElectrons;
    }

    public String getPeriod() {
        return this.Period;
    }

    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public String getGroup() {
        return this.Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getPhase() {
        return this.Phase;
    }

    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    public String getRadioactive() {
        return this.Radioactive;
    }

    public void setRadioactive(String Radioactive) {
        this.Radioactive = Radioactive;
    }

    public String getNatural() {
        return this.Natural;
    }

    public void setNatural(String Natural) {
        this.Natural = Natural;
    }

    public String getMetal() {
        return this.Metal;
    }

    public void setMetal(String Metal) {
        this.Metal = Metal;
    }

    public String getNonmetal() {
        return this.Nonmetal;
    }

    public void setNonmetal(String Nonmetal) {
        this.Nonmetal = Nonmetal;
    }

    public String getMetalloid() {
        return this.Metalloid;
    }

    public void setMetalloid(String Metalloid) {
        this.Metalloid = Metalloid;
    }

    public String getType() {
        return this.Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getAtomicRadius() {
        return this.AtomicRadius;
    }

    public void setAtomicRadius(String AtomicRadius) {
        this.AtomicRadius = AtomicRadius;
    }

    public String getElectronegativity() {
        return this.Electronegativity;
    }

    public void setElectronegativity(String Electronegativity) {
        this.Electronegativity = Electronegativity;
    }

    public String getFirstIonization() {
        return this.FirstIonization;
    }

    public void setFirstIonization(String FirstIonization) {
        this.FirstIonization = FirstIonization;
    }

    public String getDensity() {
        return this.Density;
    }

    public void setDensity(String Density) {
        this.Density = Density;
    }

    public String getMeltingPoint() {
        return this.MeltingPoint;
    }

    public void setMeltingPoint(String MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }

    public String getBoilingPoint() {
        return this.BoilingPoint;
    }

    public void setBoilingPoint(String BoilingPoint) {
        this.BoilingPoint = BoilingPoint;
    }

    public String getNumberOfIsotopes() {
        return this.NumberOfIsotopes;
    }

    public void setNumberOfIsotopes(String NumberOfIsotopes) {
        this.NumberOfIsotopes = NumberOfIsotopes;
    }

    public String getDiscoverer() {
        return this.Discoverer;
    }

    public void setDiscoverer(String Discoverer) {
        this.Discoverer = Discoverer;
    }

    public String getYear() {
        return this.Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getSpecificHeat() {
        return this.SpecificHeat;
    }

    public void setSpecificHeat(String SpecificHeat) {
        this.SpecificHeat = SpecificHeat;
    }

    public String getNumberofShells() {
        return this.NumberofShells;
    }

    public void setNumberofShells(String NumberofShells) {
        this.NumberofShells = NumberofShells;
    }

    public String getNumberofValence() {
        return this.NumberofValence;
    }

    public void setNumberofValence(String NumberofValence) {
        this.NumberofValence = NumberofValence;
    }

    // toString() Method
    public String toString() {
        return "{\"AtomicNumber\"=" + AtomicNumber + ",\"Element\"=" + Element + ",\"Symbol\"=" + Symbol + ",\"AtomicMass\"=" + AtomicMass + ",\"NumberofNeutrons\"=" + NumberofNeutrons + ",\"NumberofProtons\"=" + NumberofProtons + ",\"NumberofElectrons\"=" + NumberofElectrons + ",\"Period\"=" + Period + ",\"Group\"=" + Group + ",\"Phase\"=" + Phase + ",\"Radioactive\"=" + Radioactive + ",\"Natural\"=" + Natural + ",\"Metal\"=" + Metal + ",\"Nonmetal\"=" + Nonmetal + ",\"Metalloid\"=" + Metalloid + ",\"Type\"=" + Type + ",\"AtomicRadius\"=" + AtomicRadius + ",\"Electronegativity\"=" + Electronegativity + ",\"FirstIonization\"=" + FirstIonization + ",\"Density\"=" + Density + ",\"MeltingPoint\"=" + MeltingPoint + ",\"BoilingPoint\"=" + BoilingPoint + ",\"NumberOfIsotopes\"=" + NumberOfIsotopes + ",\"Discoverer\"=" + Discoverer + ",\"Year\"=" + Year + ",\"SpecificHeat\"=" + SpecificHeat + ",\"NumberofShells\"=" + NumberofShells + ",\"NumberofValence\"=" + NumberofValence + "}";
    }
}
