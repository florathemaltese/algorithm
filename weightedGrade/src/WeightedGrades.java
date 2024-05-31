public class WeightedGrades {
    /*set pointTotal, earnedPoints and assignment percentage as private*/
    private double pointTotal;
    private double earnedPoints;
    private double assignmentPercentage;
    private double totalWeightedGrade;

    // getters:get the value of each attributes
    public double getPointTotal(){
        return pointTotal;
    }
    public double getEarnedPoints(){
        return earnedPoints;
    }
    public double getAssignmentPercentage(){
        return assignmentPercentage;
    }
    public double getTotalWeightedGrade() {
        return totalWeightedGrade;
    }

    // setters:set the value of each attributes
    public void setPointTotal(double pointTotal) {
        this.pointTotal = pointTotal;
    }
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
    public void setAssignmentPercentage(double assignmentPercentage) {
        this.assignmentPercentage = assignmentPercentage;
    }
    public void setTotalWeightedGrade(double totalWeightedGrade) {
        this.totalWeightedGrade = totalWeightedGrade;
    }

    // calculation method
    public void calculateWeightedGrades() {
        totalWeightedGrade = earnedPoints / pointTotal * assignmentPercentage;
    }
}




