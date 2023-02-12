def buildApp() {
    echo 'building the application'
    echo "${params.namespace}"
} 

def testApp() {
    echo 'testing the application'
} 

def deployApp() {
    echo "code is deployed"
    echo "this is build number $BUILD_NUMBER"
} 
