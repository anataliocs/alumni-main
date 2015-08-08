<%@ page import="com.tdx.DonorLevelEnum" %>
<meta name="layout" content="main"/>
<title>Donation Details</title>


<div class="container marketing">

    <div class="row featurette text-center">
        <div class="col-md-12">
            <h2 class="featurette-heading">Manage <span
                    class="text-muted">Donations</span></h2>
            <span>Theta Delta Chi Rho Triton</span><br/><br/>

            <p class="lead">View and update the individual donations</p>

        </div>
    </div>

    <hr class="featurette-divider">

    <div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">

                    <div class="well well-sm">
                        <h3>
                            Donations <small></small></h3>

                        <div class="table-responsive">

                            <table class="table table-striped table-hover">
                                <thead>
                                <tr>
                                    <th>Date</th>
                                    <th>Amount</th>
                                    <th>Type</th>

                                </tr>
                                </thead>
                                <g:each in="${donations}" var="d">

                                    <tr>
                                        <td>${d.id}</td>
                                        <td>${d.amount}</td>
                                        <td>${d.donationType}</td>


                                        <td><a class="btn btn-sm btn-primary"
                                               href="${createLink(controller: 'donation', action: 'delete', params: [id: d.id])}">Delete</a>
                                        </td>
                                    </tr>

                                </g:each>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>


<!-- Contact Modal -->
<g:render template="modals/newUser"></g:render>