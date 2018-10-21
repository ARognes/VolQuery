package com.example.josh.volquery;

public class VolcanoInformation {
    private String Volcano_Number;
    private String Volcano_Name;
    private String Country;
    private String Primary_Volcano_Type;
    private String Activity_Evidence;
    private String Last_Known_Eruption;
    private String Region;
    private String Subregion;
    private String Latitude;
    private String longitude;
    private String Elevation;
    private String Dominant_rock_type;
    private String Tectonic_Setting;

    public VolcanoInformation(String Volcano_Number, String Volcano_Name, String Country,
                              String Primary_Volcano_Type, String Activity_Evidence, String Last_Known_Eruption,
                              String Region, String Subregion, String Latitude, String longitude, String Elevation,
                              String Dominant_rock_type, String Tectonic_Setting) {
        this.Volcano_Number = Volcano_Number;
        this.Volcano_Name = Volcano_Name;
        this.Country = Country;
        this.Primary_Volcano_Type = Primary_Volcano_Type;
        this.Activity_Evidence = Activity_Evidence;
        this.Last_Known_Eruption = Last_Known_Eruption;
        this.Region = Region;
        this.Subregion = Subregion;
        this.Latitude = Latitude;
        this.longitude = longitude;
        this.Elevation = Elevation;
        this.Dominant_rock_type = Dominant_rock_type;
        this.Tectonic_Setting = Tectonic_Setting;
    }

    VolcanoInformation() {
    }
    public String get_Volcano_Number(){
        return Volcano_Number;
    }
    public String get_Volcano_Name() {
        return Volcano_Name;
    }
    public String get_Country() {
        return Country;
    }
    public String get_Primary_Volcano_Type(){
        return Primary_Volcano_Type;
    }
    public String get_Activity_Evidence(){
        return Activity_Evidence;
    }
    public String get_Last_Known_Eruption(){
        return Last_Known_Eruption;
    }
    public String get_Region(){
        return Region;
    }
    public String get_Subregion(){
        return Subregion;
    }
    public String get_Latitude(){
        return Latitude;
    }
    public String get_longitude(){
        return longitude;
    }
    public String get_Elevation(){
     return Elevation;
    }
    public String get_Dominant_rock_type(){
        return Dominant_rock_type;
    }
    public String get_Tectonic_Setting(){
        return Tectonic_Setting;
    }
}
