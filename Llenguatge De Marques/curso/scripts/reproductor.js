
function redimensionaBarra() {
    if(!medio.ended) {
        var total = parseInt(medio.currentTime * maximo / medio.duration);
        progreso.style.width = total + 'px';
    } else {
        progreso.style.width = '0px';
        play.value = '\u25BA';
       // window.clearInterval(bucle);
    }
}

function desplazarMedio(e) {
    if(!medio.paused && !medio.ended) {
        var ratonX = e.pageX - barra.offsetLeft;
        var nuevoTiempo = ratonX * medio.duration / maximo;
        medio.currentTime = nuevoTiempo;
        progreso.style.width = ratonX + 'px';
    }
}
function accionPlay() {
    //volactual.value = medio.volume;
    if(!medio.paused && !medio.ended) {
        medio.pause();
        play.value = '\u25BA';
        //window.clearInterval(bucle);
    } else {
        medio.play();
        play.value = '||';
        //bucle = setInterval(redimensionaBarra, 1000);
    }
}
function iniciar() {
	maximo = 700;
	
	/* OBJETOS */
    medio = document.getElementById('medio');
    barra = document.getElementById('barra');
    progreso = document.getElementById('progreso');
    play = document.getElementById('play');
    //volactual = document.getElementById('volumenactual');
	/* Ejercicio 2. Obtener el resto de objetos de los elementos necesarios */	
	/* Ejercicio 2A. Botón reiniciar */
	reiniciar = document.getElementById("reiniciar");
	/* Ejercicio 2B. Botón retrasar */
	retrasar = document.getElementById('retrasar');
	/* Ejercicio 2C. Botón adelantar */
	adelantar = document.getElementById('adelantar');
	/* Ejercicio 2D. Botón silenciar */
	silenciar = document.getElementById('silenciar');
	/* Ejercicio 2E. Botón menos volumen */
	menosVolumen = document.getElementById('menosVolumen');
	/* Ejercicio 2F. Botón más volumen */
	masVolumen = document.getElementById('masVolumen');
	
	/* MANEJADORES */
	play.addEventListener('click', accionPlay, false);
    barra.addEventListener('click', desplazarMedio, false);
	/* Manejadores de eventos para el resto de botones */
	/* Ejercicio 2A. Función reiniciar */
	reiniciar.addEventListener("click", accionReiniciar, false);	
	/* Ejercicio 2B. Función retrasar */
	retrasar.addEventListener('click', accionRetrasar, false);
	/* Ejercicio 2C. Función adelantar */
	adelantar.addEventListener('click', accionAdelantar, false);
	/* Ejercicio 2D. Función silenciar */
	silenciar.addEventListener('click', accionSilenciar, false);
	/* Ejercicio 2E. Función menos volumen */
	menosVolumen.addEventListener('click', accionMenosVolumen, false);
	/* Ejercicio 2F. Función más volumen */
	masVolumen.addEventListener('click', accionMasVolumen, false);
}

/* =========================== EJERCICIO 2. Implementación de las funciones restantes. ====================== */
/* Ejercicio 2A. Función reiniciar */
function accionReiniciar() {
	medio.currentTime = 0;
	progreso.style.width = 0;
}
/* Ejercicio 2B. Función retrasar */
function accionRetrasar() {
    medio.currentTime -= 5;
}
/* Ejercicio 2C. Función adelantar */
function accionAdelantar() {
    medio.currentTime += 5;
}
/* Ejercicio 2D. Función silenciar */
function accionSilenciar() {
    if(medio.volume != 0) {
        medio.volume = 0;
        silenciar.value = "Escuchar";
    } else {
        medio.volume = 1;
        silenciar.value = "Silenciar";
    }
}
/* Ejercicio 2E. Función menos volumen */
function accionMenosVolumen() {
    medio.volume -= 0.1;
}
/* Ejercicio 2F. Función más volumen */
function accionMasVolumen() {
    medio.volume += 0.1;
}
window.addEventListener('load', iniciar, false);