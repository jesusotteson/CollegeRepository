function searchverify(){

    //first name
    if(document.form.fName.value == "" ){
        alert("Please provide a first name");
        document.form.fName.focus() ;
            return false;
        }
    if(!/^[a-zA-Z]+$/.test(document.form.fName.value)){
        alert("First name can only be letters");
        document.form.fName.focus();
            return false;
    }
    //last name
    if(document.form.lName.value ==""){
        alert("Please provide a last name");
                document.form.lName.focus();
                return false;
    }
    
    if(!/^[a-zA-Z]+$/.test(document.form.lName.value)){
        alert("Last name can only be letters");
        document.form.lName.focus();
            return false;
    }
    return (true);
}
function verify(){
    
    searchverify();
     
     //phone number
    if(document.form.phone.value == ""){
        alert("Provide a phone number");
        document.form.phone.focus();
        return false;
    }
    if(!/^[0-9]+$/.test(document.form.phone.value)){
        alert("Phone number can only be numbers");
        document.form.phone.focus();
        return false;
    }
    return (true);
}