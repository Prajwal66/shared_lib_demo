def call(String url, String branch)
{
  echo "Cloneing the code"
  git url: "${url}", branch: "${branch}"
  echo "clone successfull !!"
}
