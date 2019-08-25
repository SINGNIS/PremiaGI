<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register page</title>
</head>
<body>
<h2>Registration Page</h2>
<form:errors path="userregister.*"/>

<form:form action="userregister" method="POST" commandName="userregister">
<table>
<tr><td><label for="user_id" >User Id</label></td><td><form:input path="user_id" /></td></tr>
<tr><td><label for="user_type" >User Type</label></td><td><form:input path="user_type" /></td></tr>
<tr><td><label for="user_joining_on" >User Joining Date</label></td>
<td><form:input path="user_joining_on" /></td></tr>
<tr><td><label for="user_first_name" >First Name</label></td>
<td><form:input path="user_first_name" /></td> <td><form:errors path="user_first_name"/></td>
</tr>
<tr><td><label for="user_middle_name" >Middle Name</label></td>
<td><form:input path="user_middle_name" />
</tr>
<tr><td><label for="user_last_name" >Last Name</label></td>
<td><form:input path="user_last_name" />
</tr>
<tr><td><label for="user_dob" >Date of Birth</label></td>
<td><form:input path="user_dob" />
</tr>
<tr><td><label for="user_gender" >Gender</label></td>
<td><form:radiobutton path="user_gender" value="M" label="M"/>
<form:radiobutton path="user_gender" value="F" label="F"/></td></tr>

<tr><td><label for="user_address1.address1" >Address 1</label></td>
<td><form:input path="user_address1.address1" />
</tr>
<tr><td><label for="user_address1.address2" >Address 2</label></td>
<td><form:input path="user_address1.address2" />
</tr>
<tr><td><label for="user_address1.address3" >Address 3</label></td>
<td><form:input path="user_address1.address3" />
</tr>

<tr><td><label for="user_address1.city" >City</label></td>
<td>
<form:select path="user_address1.city">
<form:option value="Bangalore"></form:option>
<form:option value="Chennai"></form:option>
<form:option value="Nagpur"></form:option>
<form:option value="Patna"></form:option>
<form:option value="Madurai"></form:option>
<form:option value="Chandigarh"></form:option>
<form:option value="Shimla"></form:option>
<form:option value="Delhi"></form:option>
</form:select>
</td></tr>
<tr><td><label for="user_address1.state" >State</label></td>
<td>
<form:select path="user_address1.state">
<form:option value="Bihar"></form:option>
<form:option value="Maharashtra"></form:option>
<form:option value="Karnataka"></form:option>
<form:option value="Tamilnadu"></form:option>
<form:option value="Chattisgarh"></form:option>
<form:option value="Uttar-Pradesh"></form:option>
<form:option value="HimachalPradesh"></form:option>
<form:option value="Rajasthan"></form:option>
</form:select>
</td></tr>
<tr><td><label for="user_address1.pincode" >Pincode</label></td>
<td><form:input path="user_address1.pincode" />
</tr>
<tr><td><label for="user_contact1" >Contact Number</label></td>
<td><form:input path="user_contact1" />
</tr>
<tr><td><label for="user_address1.country" >Country</label></td>
<td>
<form:select path="user_address1.country">
<form:option value="India"></form:option>
<form:option value="USA"></form:option>
<form:option value="Srilanka"></form:option>
<form:option value="Mayanmar"></form:option>
<form:option value="Indonesia"></form:option>
<form:option value="Thailand"></form:option>
<form:option value="Vietnam"></form:option>
<form:option value="Combodia"></form:option>
</form:select>
</td></tr>

<tr><td><label for="user_maritalstatus" >Marital Status</label></td>
<td><form:radiobutton path="user_maritalstatus" value="S" label="Single"/>
<form:radiobutton path="user_maritalstatus" value="M" label="Married"/></td></tr>

<tr><td><label for="user_experience" >Experience</label></td>
<td><form:input path="user_experience" />
</tr>

<tr><td><label for="user_occupation" >Occupation</label></td>
<td><form:input path="user_occupation" />
</tr>

<tr><td><label for="user_qualification" >Qualification</label></td>
<td><form:input path="user_qualification" />
</tr>

<tr><td><label for="user_emailid" >Email Id</label></td>
<td><form:input path="user_emailid" />
</tr>

<tr><td><label for="user_password" >Password</label></td>
<td><form:input path="user_password" />
</tr>

<tr><td><label for="user_confirmpassword" >Confirm Password</label></td>
<td><form:input path="user_confirmpassword" />
</tr>

<tr><td><label for="user_domain_id" >Domain Id</label></td>
<td><form:input path="user_domain_id" />
</tr>

<tr><td><label for="user_sub_domain_id" >Sub Domain Id</label></td>
<td><form:input path="user_sub_domain_id" />
</tr>
<tr><td><button type="submit" >Register</button></td></tr>
</table>
</form:form>
</body>
</html>