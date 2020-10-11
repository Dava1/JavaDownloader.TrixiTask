package Handlers;

import Entity.CastObce;
import Entity.Obec;
import Parser.XmlParser;

import java.util.Set;

public class Downlader {
  private UrlDownloader urlDownloader;
  private ZipHandler zipHandler;
  private XmlParser xmlParser;
  public Downlader(){
       urlDownloader = new UrlDownloader();
       urlDownloader.downloadZip();
       zipHandler = new ZipHandler();
       zipHandler.unzip();
       xmlParser = new XmlParser();
   }

   public Set<Obec> getObce(){
     return xmlParser.getSetObce();
  }
  public Set<CastObce> getCastObces(){
      return xmlParser.getSetCastObce();
  }
}