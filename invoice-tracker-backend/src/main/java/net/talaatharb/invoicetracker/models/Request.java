package net.talaatharb.invoicetracker.models;

import java.util.Date;

import javax.persistence.*;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="reviewed_by_id", referencedColumnName = "id")
    private User reviewedBy;

//    @NotBlank
    private String type;

//    @NotBlank
    private boolean isFullDay;

    private String comments;

//    @NotBlank
    private String status="pending";

    private String attachmentName;

    private String attachmentUrl;

//    @NotBlank
    private int numberOfDays;


    public Request(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;

    }

}