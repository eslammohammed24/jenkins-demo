def buildApp() {
    echo 'building the application'
    echo "${params.namespace}"
} 

def testApp() {
    echo 'testing the application'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
    echo "this is build number $BUILD_NUMBER"
} 

return this

