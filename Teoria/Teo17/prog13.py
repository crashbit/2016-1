#coding: UTF-8
#Este progama crea una pagina HTML con los ultimos cinco resultados que nos arroja Spotify

#Primero importamos los paquetes que requerimos para nuestro programa
import json
import sys
import requests
from collections import Counter

#Creamos un archivo que nos permita crear nuestra página WEB
archivo = open("pagina.html", "w")

#Nos conectamos al sitio de spotify, buscamos los 5 ultimos albums de "Muse" que esten en el mercado mexicano
url = "https://api.spotify.com/v1/search?q=Komander&type=album&market=MX&limit=5"
#Hacemos la solicitud ya que hemos construido la URL
respuesta_api = requests.get(url)

#Si hay respuesta sera un JSON, entonces ahora creamos objetos
objetos = json.loads(respuesta_api.text)

albums = objetos['albums']['items']

for album in albums:
	print album['name']
	imagenes = album['images']
	imagen = imagenes[1]['url']
	mensaje =""
	mensaje = "<img src='"+ imagen +"' />"
	mensaje = mensaje + "<h1>" + album['name'] + "</h1><br>"
	archivo.write(mensaje)

archivo.close()