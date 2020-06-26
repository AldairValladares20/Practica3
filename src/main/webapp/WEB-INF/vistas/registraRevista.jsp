<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<title>ALDAIR VALLADARES</title>
</head>
<body>

<div class="container">
<h1>Registra REVISTA</h1>

	<c:if test="${sessionScope.MENSAJE != null}">
		<div class="alert alert-success fade in" id="success-alert">
		 <a href="#" class="close" data-dismiss="alert">&times;</a>
		 <strong>${sessionScope.MENSAJE}</strong>
		</div>
	</c:if>
	<c:remove var="MENSAJE" />

	<form action="registraRevista" id="id_form" method="post"> 
			<input type="hidden" name="metodo" value="registra">	
			<div class="form-group">
				<label class="control-label" for="id_nombre">Nombre</label>
				<input class="form-control" type="text" id="id_nombre" name="nombre" placeholder="Ingrese el nombre" maxlength="20"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="id_num_hombres">Precio</label>
				<input class="form-control" id="id_Precio" name="Precio" placeholder="Ingrese el Precio" type="text" maxlength="2"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="id_Serie">Serie</label>
				<input class="form-control" type="text" id="id_Serie" name="Serie" placeholder="Ingrese Serie"maxlength="20" />
			</div>
			<div class="form-group">
				<label class="control-label" for="id_FechaL">Fecha Lanzamiento</label>
				<input class="form-control" type="text" id="id_FechaL" name="FechaL" placeholder="Ingrese la Fecha Lanzamiento" maxlength="9"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="id_FechaE">Fecha Edicion</label>
				<input class="form-control" id="id_FechaE" name="FechaE" placeholder="Ingrese la Fecha Edicion" type="text" maxlength="9"/>
			</div>
			<div class="form-group">
				<label class="control-label" for="id_categoria">Categoria</label>
				<select id="id_categoria" name="categoria.idCategoria" class='form-control'>
					<option value=" ">[Seleccione]</option>    
				</select>
		    </div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary" >Crea</button>
			</div>
	</form>
</div>

<script type="text/javascript">
$.getJSON("cargaCategoria", {}, function(data){
	$.each(data, function(index,item){
		$("#id_Categoria").append("<option value="+item.idCategoria +">"+ item.nombre +"</option>");
	});
});
</script>

<script type="text/javascript">
$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

<script type="text/javascript">

$('#id_form').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
    fields: {
    	nombre: {
    		selector : '#id_nombre',
            validators: {
                notEmpty: {
                    message: 'El nombre es un campo obligatorio'
                },
                stringLength :{
                	message:'El nombre es de 5 a 100 caracteres',
                	min : 5,
                	max : 100
                }
            }
        },
        numHombres: {
    		selector : '#id_Precio',
            validators: {
                notEmpty: {
                    message: 'El precio es un campo obligatorio'
                },
                lessThan: {
	                value: 15,
	                inclusive: true,
	                message: 'El precio es menor a 1000'
	            },
	            greaterThan: {
	                value: 0,
	                inclusive: true,
	                message: 'El precio es mayor a 0'
	            }
            }
        fields: {
        	nombre: {
        		selector : '#id_Serie',
                validators: {
                    notEmpty: {
                        message: 'La serie es un campo obligatorio'
                    },
                    stringLength :{
                    	message:'La serie es de 5 a 100 caracteres',
                    	min : 5,
                    	max : 100
                    }
                }
            },
            fields: {
            	nombre: {
            		selector : '#id_FechaL',
                    validators: {
                        notEmpty: {
                            message: 'La sFecha de Lanzamiento  es un campo obligatorio'
                        },
                        stringLength :{
                        	message:'La sFecha de Lanzamiento es de 1 a 9 caracteres',
                        	min : 5,
                        	max : 100
                        }
                    }
                },
                fields: {
                	nombre: {
                		selector : '#id_FechaE',
                        validators: {
                            notEmpty: {
                                message: 'La Fecha de Edicion  es un campo obligatorio'
                            },
                            stringLength :{
                            	message:'La sFecha de Edicion es de 1 a 9 caracteres',
                            	min : 5,
                            	max : 100
                            }
                        }
                    },
       
        Categoria: {
    		selector : '#id_Categoria',
            validators: {
            	notEmpty: {
                    message: 'El Categoria un campo obligatorio'
                },
            }
        },
    	
    }   
});
</script>

<script type="text/javascript">
$("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});
</script>

</body>
</html>




