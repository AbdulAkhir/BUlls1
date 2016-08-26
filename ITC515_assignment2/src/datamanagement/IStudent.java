package datamanagement;

public interface IStudent {
// get and set methods for student
	public Integer getID();

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public void addUnitRecord(IStudentUnitRecord record);

	public IStudentUnitRecord getUnitRecord(String unitCode);

	public StudentUnitRecordList getUnitRecords();

}
