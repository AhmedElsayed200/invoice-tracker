package net.talaatharb.invoicetracker.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
    private Date startDate;

//    @NotBlank
    private Date requestDate;

//    @NotBlank
    private Date endDate;

    //    @NotBlank
    private Long requestedBy;



    private Long reviewedBy;


    private String type;

//    @NotBlank
    private boolean isFullDay;

//        @NotBlank

    private String status="Pending";

    private String comment;

//    @NotBlank


    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "request")
    private List<AbsenceAttachments> absenceAttachments;

//    @NotBlank
    private int numberOfDays;


    public Request(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Request(Date startDate, Date endDate, Long requestedBy, String type, int numberOfDays) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestedBy = requestedBy;
        this.type = type;
        this.numberOfDays = numberOfDays;
    }
}
