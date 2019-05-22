/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.dto;

/**
 *
 * @author Sanu Vithanage
 */
public class ProjectsDTO extends SuperDTO{
    private int id;
    private String projectName;
    private String image1;
    private String image2;
    private String image3;
    private String image5;
    private String link;
    private SemesterDTO semester;

    public ProjectsDTO() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the image1
     */
    public String getImage1() {
        return image1;
    }

    /**
     * @param image1 the image1 to set
     */
    public void setImage1(String image1) {
        this.image1 = image1;
    }

    /**
     * @return the image2
     */
    public String getImage2() {
        return image2;
    }

    /**
     * @param image2 the image2 to set
     */
    public void setImage2(String image2) {
        this.image2 = image2;
    }

    /**
     * @return the image3
     */
    public String getImage3() {
        return image3;
    }

    /**
     * @param image3 the image3 to set
     */
    public void setImage3(String image3) {
        this.image3 = image3;
    }

    /**
     * @return the image5
     */
    public String getImage5() {
        return image5;
    }

    /**
     * @param image5 the image5 to set
     */
    public void setImage5(String image5) {
        this.image5 = image5;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the semester
     */
    public SemesterDTO getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(SemesterDTO semester) {
        this.semester = semester;
    }
    
    
}
