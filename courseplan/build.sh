#!/bin/bash

# generate tex from markdown using pandoc: http://pandoc.org/
echo ""
echo "*** generating pandoc ***"
echo ""
pandoc --version
echo ""
echo pandoc --read markdown_github body.md -o generated-body.tex
echo ""
pandoc --read markdown_github body.md -o generated-body.tex

echo ""
echo "*** generating pdf ***"
echo ""
echo pdflatex courseplan.tex
echo ""

pdflatex courseplan.tex
