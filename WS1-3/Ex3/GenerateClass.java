import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author josh
 *@version 26/10/19
 */
public class GenerateClass {
	String classname;
	String[] variableNames;
	String[] variableTypes;


	/**
	 * @param classname
	 * @param variableNames
	 * @param variableTypes
	 */
	public GenerateClass(String classname, String[] variableNames, String[] variableTypes) {
		this.classname = classname;
		this.variableNames = variableNames;
		this.variableTypes = variableTypes;
	}


	/**
	 * make fields method
	 */
	public String makeFields() {
		StringBuilder fields = new StringBuilder();
		for(int i =0;i < variableNames.length;i++) {
			fields.append("  private ").append(variableTypes[i]).append(" ").append(variableNames[i]).append(";\n");
		}
		fields.append("\n");
		return fields.toString();
	}
	/**
	 * make constructor method, checking the variables are greater than 0, the creating the string for each variable
	 */
	public String makeConstructor() {
		StringBuilder fields = new StringBuilder();
		if (variableNames.length == 0) {
			fields.append("  public ").append(classname).append("(){}\n");
			return fields.toString();
			
		}
		fields.append("  public ").append(classname).append("(");
		for(int i =0;i < variableNames.length;i++) {
			fields.append(variableTypes[i]).append(" ").append(variableNames[i]);
			if (i != variableNames.length -1) {
				fields.append(", ");
			}
		}
		fields.append("){\n");
		for (String variableName : variableNames) {
			fields.append("    this.").append(variableName).append(" = ").append(variableName).append(";\n");
		}
		fields.append("  }\n");
		return fields.toString();
		
	}
	/**
	 * make getters method, using the captialise method and returning the toString for each variable
	 */
	public String makeGetters() {
		StringBuilder fields = new StringBuilder();
		for(int i =0;i < variableNames.length;i++) {
			fields.append("  public ").append(variableTypes[i]).append(" get").append(capitalise(variableNames[i])).append("(){\n");
			fields.append("    return ").append(variableNames[i]).append(";\n").append("  }\n");
		}
		return fields.toString();
	}

	/**
	 * make setters method, using the captialise method and returning the toString for each variable
	 */
	public String makeSetters() {
		StringBuilder fields = new StringBuilder();
		for(int i =0;i < variableNames.length;i++) {
			fields.append("  public void set").append(capitalise(variableNames[i])).append("(").append(variableTypes[i]).append(" ").append(variableNames[i]).append("){\n");
			fields.append("    this.").append(variableNames[i]).append(" = ").append(variableNames[i]).append(";\n  }\n");
		}
		return fields.toString();
	}
	/**
	 * write file method, using bufferedwriter and filewriter
	 */
	public void writeFile(){
			try {
				BufferedWriter out = new 	BufferedWriter(new FileWriter(classname + (".java")));
				out.write("class " + classname + "{\n" + makeFields() + makeConstructor() + makeGetters() + makeSetters() + "}");
				out.close();


				} catch (IOException e) {
				e.printStackTrace();
			}


		}
	/**
	 * capitalise method, returning the the first character of text as a capital
	 */
		public String capitalise(String text){
			return Character.toUpperCase(text.charAt(0)) + text.substring(1);
		}

    public static void main(String[] args) {
        	String classname = "Person";
        	String[] variableNames = {};
        	String[] variableTypes = {};
					GenerateClass person = new GenerateClass(classname, variableNames, variableTypes);
					person.writeFile();
					
				

	}

}

