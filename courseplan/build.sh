#!/bin/bash

# generate tex from markdown using pandoc: http://pandoc.org/
pandoc --read markdown_github body.md -o generated-body.tex
pdflatex courseplan.tex
