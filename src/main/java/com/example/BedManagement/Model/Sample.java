package com.example.BedManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean appetite;
    private boolean desire;
    private boolean aversion;
    private boolean thirst;
    private boolean thermalReaction;
    private boolean obGyHistory;
    private boolean constitution;
    private boolean skin;
    private boolean nails;
    private boolean bp;
    private boolean pulse;
    private boolean addictions;
    private boolean rR;
    private boolean tongue;
    private boolean pallor;
    private  boolean oedema;
    private boolean eyes;
    private boolean chest;
    private boolean head;
    private boolean diagnosis;
    private boolean perspiration;
    private boolean sleep;
    private boolean bowels;
    private boolean menses;
    private boolean dreams;
    private boolean urine;
    private boolean stool;
    private boolean pastHistory;
    private boolean familyHistory;
    private boolean mentalGenerals;
    private boolean physicalGeneral;
    private boolean hair;
    private boolean clubbing;
    private boolean cyanosis;
    private boolean extremities;
    private boolean icterus;
    private boolean temp;
    private boolean cns;
    private boolean cvs;
    private boolean rs;
    private boolean pa;
    private boolean other;
    private boolean co;
    private boolean ho;
    private boolean nadi;
    private boolean udar;
    private boolean kshuda;

    private boolean mal;
    private boolean nidra;
    private boolean dignosis;
    private boolean ur;
    private boolean jivha;
    private boolean aahar;
    private boolean mutra;
    private  boolean investigation;
    private boolean bahynetra;
    private boolean varatmandal;
    private boolean shuklamandal;
    private boolean krushnamandal;
    private boolean tarkamandal;
    private boolean drustimandal;
    private boolean purvavesham;
    private boolean ambirag;
    private boolean sambirg;
    private  boolean iopRe;
    private boolean pupilRe;
    private  boolean lensRe;
    private boolean odRe;
    private boolean cdrRe;
    private boolean maculaRe;
    private boolean bloodVesselsRe;
    private boolean peripheralRetinaRe;
    private boolean bahaykaran;
    private boolean karankuhar;
    private boolean bahaynasik;
    private boolean nasaghua;
    private boolean shailshikkala;
    private boolean osht;
    private boolean gilayu;
    private boolean kanth;
    private boolean kapalsathi;
    private boolean shastrakram;
    private boolean departmentType;
    private boolean gonioscopy;
    private boolean bahaynetra;
    private boolean vartammandal;
    private boolean dant;
    private boolean talu;
    private boolean galshundika;
    private boolean akruti;
    private boolean anay;
    private boolean ipdRoundDate;
    private boolean kco;
    private boolean taapman;
    private boolean habit;
    private boolean spraptighatak;
    private boolean naidanikpariksha;
    private boolean vadivinishay;
    private boolean ashtavidParikshamutra;
    private boolean koshta;
    private  boolean sharirPraman;
    private boolean vayamshakti;
    private boolean vishishstrospariksha;
    private boolean vavychedaknidana;



}
