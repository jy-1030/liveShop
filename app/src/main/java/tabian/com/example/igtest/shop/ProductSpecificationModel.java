package tabian.com.example.igtest.shop;

public class ProductSpecificationModel {

    public static  final int SPECIFICATION_TITLE = 0;
    public static final int SPECIFICATION_BODY = 1;

    private int type;

    public int getType() {
        return type;
    }

    ////////////////specificaiton title
    private  String title;
    public ProductSpecificationModel(int type, String title){
        this.type = type;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    ///////////////specification title


    ///////////////specification body
    private String featureName;
    private String featureValue;
    public ProductSpecificationModel(int type, String featureName,String featureValue){
        this.type = type;
        this.featureName = featureName;
        this.featureValue = featureValue;
    }
//    public static int getSpecificationTitle() {
//        return SPECIFICATION_TITLE;
//    }
    public String getFeatureName() {
        return featureName;
    }
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
    public String getFeatureValue() {
        return featureValue;
    }
    public void setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
    }
    ///////////////specification body






//    public ProductSpecificationModel(String featureName, String featureValue){
//        this.featureName = featureName;
//        this.featureValue = featureValue;
//    }
//    public String getFeatureName() {
//        return featureName;
//    }
//    public void setFeatureName(String featureName) {
//        this.featureName = featureName;
//    }
//    public String getFeatureValue() {
//        return featureValue;
//    }
//    public void setFeatureValue(String featureValue) {
//        this.featureValue = featureValue;
//    }
}