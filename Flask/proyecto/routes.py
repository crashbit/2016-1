from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
def index():
	return render_template("index.html")

@app.route("/pamn/<alumno>")
def pamn(alumno):
	return render_template("pamn.html", name = alumno)


if __name__ == '__main__':
	app.run(debug=True)