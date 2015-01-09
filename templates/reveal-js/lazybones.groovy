// Stops handle bar lib from spitting out slf4j warnings.
@Grab(group='org.slf4j', module='slf4j-nop', version='1.7.9')

// Setup for handle bar template engine.
@GrabResolver(name='jcenter', root='http://jcenter.bintray.com/')
@Grab(group='uk.co.cacoethes', module='groovy-handlebars-engine', version='0.2')

import uk.co.cacoethes.handlebars.HandlebarsTemplateEngine

// Set handle bar template engine as the defule engine.
registerDefaultEngine new HandlebarsTemplateEngine()

enum Theme {
  DEFAULT("default", "Gray background, white text, blue links"),
  BEIGE("beige", "Beige background, dark text, brown links"),
  SKY("sky", "Blue background, thin white text, blue links"),
  NIGHT("night", "Black background, thick white text, orange links"),
  SERIF("serif", "Cappuccino background, gray text, brown links"),
  SIMPLE("simple", "White background, black text, blue links"),
  SOLARIZED("solarized", "Cream-colored background, dark green text, blue links")

  final String name
  final String description

  Theme(String name, String description) {
    this.name = name
    this.description = description
  }
}

def props = [:]
props.title = ask("What is the tile of this presentation: ", "Example Title", "title")
props.description = ask("What is the description of the presentation: ", "A description should go here.", "description")
props.author = ask("What is your name: ", "John Doe", "author")

println ""
Theme.values().each { Theme theme ->
  println "$theme.name: $theme.description"
}
props.theme = ask("Choose a theme [default]: ", "default", "theme")

processTemplates "src/index.html", props
