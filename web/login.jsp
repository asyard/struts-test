<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
    <title>Login Page</title>
    <script type="text/javascript" src="/js/jquery-2.2.4.min.js"></script>
    <script type="text/javascript" src="/js/jquery.blockUI.js"></script>
</head>
<body>
<div style="color:red">
    <html:errors />
</div>

<div id="formDiv">
    <html:form action="/Login" onsubmit="return validateAndSubmit();">
        User Name :<html:text name="LoginForm" property="userName" />
        Password  :<html:password name="LoginForm" property="password" styleId="formPass" />
        <html:submit property="mCommand" styleId="mCommand" value="Login" />
    </html:form>
</div>

<script language="javascript" type="text/javascript">

    $(document).ready(function() {
        $('#mCommand').click(function() {
            /*$.blockUI({ message: "Please wait .. " });
            setTimeout($.unblockUI, 2000);*/

            $('div#formDiv').block({ message: null });

        });
    });

    function validateAndSubmit() {
        document.forms[0].mCommand.disabled = 'true';
    }
</script>


</body>
</html>