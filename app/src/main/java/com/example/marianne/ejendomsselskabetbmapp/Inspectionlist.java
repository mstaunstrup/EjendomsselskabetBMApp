package com.example.marianne.ejendomsselskabetbmapp;


import org.w3c.dom.Text;

import java.util.Date;

public class Inspectionlist {

    private int _id;
    private Date _date;
    private String _room; // Skal laves til enum
    private String _addres; // Skal laves til enum
    private Boolean _acquisition;
    private String _taskdescription;
    private Boolean _scheduled;
    private Boolean _completed;
    private String _pictureaddress;

    public Inspectionlist(){}

    public Inspectionlist(String room){
        this._taskdescription = room;
    }
    // En fuld constructor dog uden id
    public Inspectionlist(Date _date, String _room, String _addres, Boolean _acquisition,
                          String _taskdescription, Boolean _scheduled, Boolean _completed,
                          String _pictureaddress) {
        this._date = _date;
        this._room = _room;
        this._addres = _addres;
        this._acquisition = _acquisition;
        this._taskdescription = _taskdescription;
        this._scheduled = _scheduled;
        this._completed = _completed;
        this._pictureaddress = _pictureaddress;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public void set_room(String _room) {
        this._room = _room;
    }

    public void set_addres(String _addres) {
        this._addres = _addres;
    }

    public void set_acquisition(Boolean _acquisition) {
        this._acquisition = _acquisition;
    }

    public void set_taskdescription(String _taskdescription) {
        this._taskdescription = _taskdescription;
    }

    public void set_scheduled(Boolean _scheduled) {
        this._scheduled = _scheduled;
    }

    public void set_completed(Boolean _completed) {
        this._completed = _completed;
    }

    public void set_pictureaddress(String _pictureaddress) {
        this._pictureaddress = _pictureaddress;
    }

    public int get_id() {
        return _id;
    }

    public Date get_date() {
        return _date;
    }

    public String get_room() {
        return _room;
    }

    public String get_addres() {
        return _addres;
    }

    public Boolean get_acquisition() {
        return _acquisition;
    }

    public String get_taskdescription() {
        return _taskdescription;
    }

    public Boolean get_scheduled() {
        return _scheduled;
    }

    public Boolean get_completed() {
        return _completed;
    }

    public String get_pictureaddress() {
        return _pictureaddress;
    }
}
