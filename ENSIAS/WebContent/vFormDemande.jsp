<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="row">
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<div class="form-example-wrap mg-t-30">
			<div class="cmp-tb-hd cmp-int-hd">
				<h2>Demander Un service</h2>
			</div>
			
			<div class="row">
			<form action="MyServlet" method="post">
			<input type="hidden"  name="action" value="EnvoyerDemande">
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
					<div class="nk-int-mk sl-dp-mn sm-res-mg-t-10">
						<h2>Type de services</h2>
					</div>
					<div class="bootstrap-select fm-cmp-mg">
						<select class="selectpicker" data-live-search="true">
							<option>Attestation d'inscription</option>
							<option>attestation de réussite</option>
							<option>Fiche de stage</option>
						</select>
					</div>

				</div>
			
				<div class="col-lg-4 col-md-4 col-sm-3 col-xs-12">
				<i class="btn btn-success notika-btn-success waves-input-wrapper waves-effect" style="color: rgb(255, 255, 255);background: #00c292;"><input type="submit" class="waves-button-input" value="Envoyer" style="background-color:rgba(0,0,0,0);"></i>
						
				</div>
				</form>
			</div>
		</div>
	</div>
</div>