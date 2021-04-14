<!doctype html>
<html lang="en">

	<head>
		<meta charset="utf-8">

		<title>Jekyll and Reveal.js</title>

		<meta name="description" content="A framework for easily creating beautiful presentations using HTML">
		<meta name="author" content="jekyll-revealjs contributors">
		<meta name="apple-mobile-web-app-capable" content="yes" />
		<meta name="apple-mobile-web-app-status-bar-style" content="black-translucent" />

		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<link rel="stylesheet" href="assets/reveal.js/css/reveal.css">
		<link rel="stylesheet" href="assets/reveal.js/css/theme/black.css" id="theme">


		<!-- For syntax highlighting -->
		
		<link rel="stylesheet" href="assets/reveal.js/lib/css/zenburn.css">

		<!-- If the query includes 'print-pdf', use the PDF print sheet -->
		<script>
			document.write( '<link rel="stylesheet" href="assets/reveal.js/css/print/' + ( window.location.search.match( /print-pdf/gi ) ? 'pdf' : 'paper' ) + '.css" type="text/css" media="print">' );
		</script>

		<!--[if lt IE 9]>
		<script src="assets/reveal.js/lib/js/html5shiv.js"></script>
		<![endif]-->
	</head>

	<body>

		<div class="reveal">

			<div class="slides">

				

			</div>

		</div>

		<script src="assets/reveal.js/lib/js/head.min.js"></script>
		<script src="assets/reveal.js/js/reveal.js"></script>

		<script>

			// Full list of configuration options available here:
			// https://github.com/hakimel/reveal.js#configuration
			Reveal.initialize({
				controls: true,
				progress: true,
				history: true,
				center: true,

				theme: Reveal.getQueryHash().theme, // available themes are in /css/theme
				transition: 'default', // default/cube/page/concave/zoom/linear/fade/none

				

				// Optional libraries used to extend on reveal.js
				dependencies: [
					{ src: 'assets/reveal.js/lib/js/classList.js', condition: function() { return !document.body.classList; } },
					{ src: 'assets/reveal.js/plugin/markdown/marked.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },
					{ src: 'assets/reveal.js/plugin/markdown/markdown.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },
					{ src: 'assets/reveal.js/plugin/highlight/highlight.js', async: true, callback: function() { hljs.initHighlightingOnLoad(); } },
					{ src: 'assets/reveal.js/plugin/zoom-js/zoom.js', async: true, condition: function() { return !!document.body.classList; } },
					
					{ src: 'assets/reveal.js/plugin/notes/notes.js', async: true, condition: function() { return !!document.body.classList; } }
					
					
				]
			});

		</script>

	</body>
</html>
