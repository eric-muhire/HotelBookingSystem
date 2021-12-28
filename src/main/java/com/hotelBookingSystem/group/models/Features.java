package com.hotelBookingSystem.group.models;

public class Features {

    private Long id;
    private String work_desk;
    private String concierge_service;
    private String sea_view;
    private String twentyFourSeven_room_service;
    private String smartphone_for_room_control;

public Features() {

}

    public Features(Long id, String work_desk, String concierge_service, String sea_view, String twentyfour_room_service, String smartphone_for_room_control) {
        this.id = id;
        this.work_desk = work_desk;
        this.concierge_service = concierge_service;
        this.sea_view = sea_view;
        this.twentyFourSeven_room_service = twentyfour_room_service;
        this.smartphone_for_room_control = smartphone_for_room_control;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWork_desk() {
        return work_desk;
    }

    public void setWork_desk(String work_desk) {
        this.work_desk = work_desk;
    }

    public String getConcierge_service() {
        return concierge_service;
    }

    public void setConcierge_service(String concierge_service) {
        this.concierge_service = concierge_service;
    }

    public String getSea_view() {
        return sea_view;
    }

    public void setSea_view(String sea_view) {
        this.sea_view = sea_view;
    }

    public String getTwentyFourSeven_room_service() {
        return twentyFourSeven_room_service;
    }

    public void setTwentyFourSeven_room_service(String twentyFourSeven_room_service) {
        this.twentyFourSeven_room_service = twentyFourSeven_room_service;
    }

    public String getSmartphone_for_room_control() {
        return smartphone_for_room_control;
    }

    public void setSmartphone_for_room_control(String smartphone_for_room_control) {
        this.smartphone_for_room_control = smartphone_for_room_control;
    }

    @Override
    public String toString() {
        return "Features{" +
                "id=" + id +
                ", work_desk='" + work_desk + '\'' +
                ", concierge_service='" + concierge_service + '\'' +
                ", sea_view='" + sea_view + '\'' +
                ", twentyFourSeven_room_service='" + twentyFourSeven_room_service + '\'' +
                ", smartphone_for_room_control='" + smartphone_for_room_control + '\'' +
                '}';
    }
}
