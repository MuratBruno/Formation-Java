<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Smooss</title>
        <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.9/css/all.css" integrity="sha384-5SOiIsAziJl6AWe0HWRKTXlfcSHKmYV4RBF18PPJ173Kzn7jzMyFuTtk8JA7QQG1" crossorigin="anonymous">    
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        
        <!-- Simple nav -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark" id="navbar_index">
            <a class="navbar-brand" href="index.php" id="logo_home">Smooss</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
                <div class="navbar-nav mr-5 link_style">
                    <a class="nav-item nav-link" data-toggle="modal" data-target="#modalConnexion">Connexion</a>
                    <a class="nav-item nav-link" data-toggle="modal" data-target="#modalInscription">Inscription</a>
                </div>
            </div>
        </nav>            


        <!-- MODAL INSCRIPTION -->        
        <div class="modal fade" id="modalInscription" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
	            <div class="modal-content">
	                <div class="modal-header">
	                    <h5 class="modal-title text-center" id="exampleModalLabel">Inscription</h5>
	                </div>
	                <form method="POST" action="TraitFormServlet">
		                <div class="modal-body">
		                        <div class="form-group">
		                            <div class="input-group">
		                                <div class="input-group-prepend">
		                                    <div class="input-group-text"> <i class="fas fa-at"></i> </div>
		                                </div>
		                                <input type="text" class="form-control" name="email" id="email" placeholder="Adresse mail" class="input_modal">
		                            </div>
		                        </div>
		                        <div class="form-group">
		                            <div class="input-group">
		                                <div class="input-group-prepend">
		                                    <div class="input-group-text"> <i class="fas fa-user"></i> </div>
		                                </div>
		                                <input type="text" class="form-control" name="pseudo" id="pseudo" placeholder="Pseudo" class="input_modal">
		                            </div>
		                        </div>
		                        <div class="form-group">
		                            <div class="input-group">
		                                <div class="input-group-prepend">
		                                    <div class="input-group-text"> <i class="fas fa-lock"></i> </div>
		                                </div>
		                                <input type="password" class="form-control" name="password" id="password" placeholder="Mot de passe" class="input_modal">
		                            </div>
		                        </div>
		                        <div class="form-group">
		                            <div class="input-group">
		                                <div class="input-group-prepend">
		                                    <div class="input-group-text"> <i class="fas fa-lock"></i> </div>
		                                </div>
		                                <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm" placeholder="Confirmation mot de passe" class="input_modal">
		                            </div>
		                        </div>
		                </div>
		                <div class="modal-footer justify-content-center">
		                    <button type="submit" class="btn button_submit_modal" id="button_submit_inscription_modal"> Devenir un Smoosser ! </button>
		                </div>
	                </form>
	            </div>
            </div>
        </div>


        <!-- MODAL CONNEXION -->        
        <div class="modal fade" id="modalConnexion" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Connexion</h5>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text"> <i class="fas fa-user"></i> </div>
                                    </div>
                                    <input type="text" class="form-control" name="" id="" placeholder="Adresse mail | Pseudo" class="input_modal">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text"> <i class="fas fa-lock"></i> </div>
                                    </div>
                                    <input type="text" class="form-control" name="" id="" placeholder="Mot de passe" class="input_modal">
                                </div>
                            </div>
                        </form>
                        <hr class="hr-text" data-content="OU">
                        <div class="justify-content-center" id="delete_it_later_block_img">
                            <img src="img/connexion-RS.png">
                        </div>
                    </div>
                    <div class="modal-footer justify-content-center">
                        <a href="home_user.php" style="width: 100%;">
                            <button type="submit" class="btn button_submit_modal" id="button_submit_connexion_modal"> Connexion ! </button>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Container with carousel -->
        <div class="container-fluid" id="carousel_container_index">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100 h-100" src="img/second.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100 h-100" src="img/second.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100 h-100" src="img/second.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>

        <!-- Footer div -->
        
        <footer id="footer_bottom_index">
            <div class="container-fluid">
                <div class="row justify-content-around">
                    <div class="footer_bottom_index_div">
                        <h6>Smooss</h6>
                        <a href="#">A propos</a>
                        <a href="#">Aide</a>
                        <a href="#">Qui sommes nous ?</a>
                    </div>
                    <div class="footer_bottom_index_div">
                        <h6>Feedback</h6>
                        <a href="#">Nous contacter</a>
                        <a href="#">Envoyez nous vos idées</a>
                        <a href="#">Nous aider ?</a>
                    </div>
                    <div class="footer_bottom_index_div">
                        <h6>Règles</h6>
                        <a href="#">Conditions</a>
                        <a href="#">Politique de confidentialité</a>
                        <a href="#">...</a>
                    </div>
                </div>
            </div>    
        </footer>      

        <!-- Import js lib : jquery & bootstrap -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>