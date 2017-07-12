/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeBookClient.edu.asu.cse564.assign2.crud.gradebook.arao23.cli.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Abhishek
 */
@XmlRootElement(name = "GradeItem")
@XmlAccessorType(XmlAccessType.FIELD)
public class GradeItem2 {
    @XmlElement(name = "gradeItemName")
    private String gradeItemName;
    @XmlElement(name = "percentageAllocation")
    private int percentageAllocation;
     @XmlElement(name = "marksObtained")
    private int marksObtained;
     @XmlElement(name = "feedback")
     private String feedback;
     @XmlElement(name = "appeal")
     private String appeal;
     @XmlElement(name = "links")
     private List<Link> links = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
     
    public void addLink(String url, String rel) {
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		links.add(link);
	}

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


    public GradeItem2() {
       // this.links = null;
    }
       

    public GradeItem2(String gradeItemName, int percentageAllocation, int marksObtained,String feedback) {
        this.gradeItemName = gradeItemName;
        this.percentageAllocation = percentageAllocation;
        this.marksObtained = marksObtained;
        this.feedback=feedback;
    }
    

    public String getGradeItemName() {
        return gradeItemName;
    }

    public void setGradeItemName(String gradeItemName) {
        this.gradeItemName = gradeItemName;
    }

    public int getPercentageAllocation() {
        return percentageAllocation;
    }

    public void setPercentageAllocation(int percentageAllocation) {
        this.percentageAllocation = percentageAllocation;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }
    
}
