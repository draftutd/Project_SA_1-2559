package com.draft.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PurchaseOrder {

    /**
     */
    @ManyToOne
    private Employee EmpName;

    /**
     */
    @NotNull
    private String ProductName;

    /**
     */
    private Integer ProductAmount;

    /**
     */
    private Integer Price;

    /**
     */
    private Boolean Status;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar Dates;

    /**
     */
    private String stringDate;

    /**
     */
    private String employeeName;
}
