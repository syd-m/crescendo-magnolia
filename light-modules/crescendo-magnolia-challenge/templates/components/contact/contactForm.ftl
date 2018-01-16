

<form method="post" action="${contextPath}/contact" modelAttribute="contactForm">
    <blossom:pecid-input />
    <div class="form-control">
        <label>First Name:</label>
        <input type="text" name="firstName" />

    </div>
    <div class="form-control">

        <label>Last Name:</label>
        <input type="text" name="lastName" />

    </div>
    <div class="form-control">

        <label>E-mail:</label>
        <input type="text" name="email" />

    </div>
    <div class="form-control">
        <input type="checkbox" name="join" />
        <label>Join the mailing list</label>

    </div>
    <div class="form-control">
        <input type="submit" value="Submit Form" />
    </div>
</form>